import cv2
import numpy as np

# Load image
image = cv2.imread('Assets/flowers.jpg')

# Create a detector with parameters
params = cv2.SimpleBlobDetector_Params()
params.filterByColor= False
# params.blobColor =  # Detect light blobs on dark background
params.minArea = 50    # Minimum blob area
params.maxArea = 4000  # Maximum blob area
detector = cv2.SimpleBlobDetector_create(params)

# Detect blobs
keypoints = detector.detect(image)

# Draw circles at blob centers
blobs_image = cv2.drawKeypoints(image, keypoints, np.array([]), (255, 0, 0),
                                cv2.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS)

# Display the original image and the image with detected blobs
cv2.imshow('Original Image', image)
cv2.imshow('Blobs Detection', blobs_image)
cv2.waitKey(0)
cv2.destroyAllWindows()
