import cv2
import numpy as np

# Load the input image
image = cv2.imread('Assets/landscape.jpg')

# 1. Image Blurring (Smoothing)
# Applying Gaussian blur to the image
blurred_image = cv2.GaussianBlur(image, (21, 21), 0)

# 2. Image Sharpening
# Creating a kernel for sharpening
kernel = np.array([
    [-1, -1, -1],
    [-1, 9, -1],
    [-1, -1, -1]])
# Applying the sharpening kernel to the image
sharpened_image = cv2.filter2D(image, -1, kernel)

# Display the original, blurred, and sharpened images
cv2.imshow('Original Image', image)
cv2.imshow('Blurred Image', blurred_image)
cv2.imshow('Sharpened Image', sharpened_image)

# Wait for a key press and then close the windows
cv2.waitKey(0)
cv2.destroyAllWindows()
